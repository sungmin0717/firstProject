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
    console.log(a);
    
    
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
      console.log(currentIndex);
      updateActiveDot(currentIndex);
    }, 5000);
  }

  startSlider();

  for (let b = 0; b < dots.length; b++) {
    dots[b].addEventListener('click', () => {
      const click = dots[b].getAttribute('data-index');
      bannerBox.style.transform = `translateX(-${click * 100}%)`;
      console.log(click);
      currentIndex = click;
      updateActiveDot(currentIndex);
      //커런트 인덱스에 따라 배경 색 변경
      
      clearInterval(intervalID);

      startSlider();
    });
  }

updateActiveDot(currentIndex);



