const btn = document.querySelector('.right-text');

let intervalID;


const slides = document.querySelectorAll('.banner');
const bannerBox = document.querySelector('.banner-box');
const totalSlides = slides.length;

btn.addEventListener('click', () => {
  location.href = '/subPage';
});


const dotBox = document.querySelector('.dot-box');


var click = 0;

  for(a = 0; a < slides.length; a++){
    
    
    const div = document.createElement('div');
    div.classList.add('dot');
    div.setAttribute('data-index', a); 
    dotBox.appendChild(div);
  }

  
  let currentIndex = 0;
  const dots = document.querySelectorAll('.dot');
  function updateActiveDot(index) {
    dots.forEach(dot => dot.classList.remove('banner-dot-color')); // 모두 제거
    dots[index].classList.add('banner-dot-color'); // 현재 인덱스만 추가
  }
  updateActiveDot(currentIndex);

  function startSlider() {
    intervalID = setInterval(() => {
      currentIndex = (currentIndex + 1) % totalSlides;
      bannerBox.style.transform = `translateX(-${currentIndex * 100}%)`;
      updateActiveDot(currentIndex);
    }, 5000);
  }

  startSlider();

  for (let b = 0; b < dots.length; b++) {
    dots[b].addEventListener('click', () => {
      const click = dots[b].getAttribute('data-index');
      bannerBox.style.transform = `translateX(-${click * 100}%)`;
      currentIndex = click;
      updateActiveDot(currentIndex);
      //커런트 인덱스에 따라 배경 색 변경
      
      clearInterval(intervalID);

      startSlider();
    });
  }

updateActiveDot(currentIndex);





/* 자연스러운 애니메이션 추가 */
/* observer에 추가한 코드를 여기서 실행 

*/
let observer = new IntersectionObserver((e) => {

  e.forEach((a) => {
    if(a.isIntersecting){
      
      a.target.style.opacity = 1;
      a.target.style.transition = '0.5s ease-in-out';
    }else{
      a.target.style.opacity = 0;
    }

  });

  
})

let div = document.querySelectorAll('.div-show');
observer.observe(div[0]);
observer.observe(div[1]);
observer.observe(div[2]);




/* 카카오 맵 */
// 이미지 지도에서 마커가 표시될 위치입니다 
var markerPosition  = new kakao.maps.LatLng(33.450701, 126.570667); 

// 이미지 지도에 표시할 마커입니다
// 이미지 지도에 표시할 마커는 Object 형태입니다
var marker = {
    position: markerPosition
};

var staticMapContainer  = document.getElementById('staticMap'), // 이미지 지도를 표시할 div  
    staticMapOption = { 
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 이미지 지도의 중심좌표
        level: 3, // 이미지 지도의 확대 레벨
        marker: marker // 이미지 지도에 표시할 마커 
    };    

// 이미지 지도를 생성합니다
var staticMap = new kakao.maps.StaticMap(staticMapContainer, staticMapOption);





