


const btn = document.querySelector('.btn');




btn.addEventListener('click', (e) => {


  const name = document.querySelector('.name').value;
  const email = document.querySelector('.email').value;
  const phon = document.querySelector('.phon').value;

  // console.log(name, email, phon);

  const blockTransmission = e.preventDefault();

  /* 정규표현식 */
  const phonePattern = /[^0-9]/g;
  const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  const namePattern = /^[가-힣]{2,10}$/;
  /* ----------------- */


  if (!name || !email || !phon) {
    blockTransmission;
    alert("정보를 정확히 작성해주세요.");
    return;
  } else if (namePattern.test(name) === false) {
    blockTransmission;
    alert("이름을 정확히 작성해주세요.");
    return;
  } else if (emailPattern.test(email) === false) {
    blockTransmission;
    alert("이메일 주소를 정확히 작성해주세요.");
    return;
  } else if (phon.length !== 11) {
    blockTransmission;
    alert("휴대폰번호가 알맞지않습니다. 11자로 작성해주세요.");
    return;
  } else if (phonePattern.test(phon)) {
    blockTransmission;
    alert("휴대폰 정보를 잘못입력하셨습니다.");
    return;
  }

  /* 정보 확인 */
  const Next = confirm("정보를 확인해주세요." + "\n" + "이름 : " + name + "\n" + "이메일 : " + email + "\n" + "휴대폰번호 : " + phon + "\n" + "정보가 정확하면서 확인눌러주세요.");
  if (Next === false) {
    alert("취소되었습니다.")
    return;
  }

  fetch("/subPage/information", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      studentName: name,
      studentEmail: email,
      studentTel: phon
    })

  })
  .then(response => response.text())
  .then(data => {
    console.log(data);
    
    if (data === "f") {
      alert("신청되어있는 상태입니다.");
      return;
    } else {
      alert("정보 등록 성공.")
      location.href = "/";
    }
  })



})

const logo = document.querySelector('.logo');
logo.addEventListener('click', () => {
  location.href = "/"
})