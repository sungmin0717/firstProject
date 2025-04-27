const selects = document.querySelectorAll('select[name="select"]');
const studentNos = document.querySelectorAll('.studentNo');

let result = [];

// 학생 번호 모으기
for (let i = 0; i < studentNos.length; i++) {
  result.push(studentNos[i].textContent.trim());
}

// select 변경 감지
for (let i = 0; i < selects.length; i++) {
  selects[i].addEventListener('change', () => {

    console.log(result[i], selects[i].value);
    


    fetch("/admin/userTrueFalse", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        studentTf: selects[i].value,
        studentNo: result[i],
      }),
    });

  });
}




const consultation = document.querySelector('.consultation');

consultation.addEventListener('click', () => {

  fetch("/admin/consultation", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    }
  })
    .then(response => response.text())
    .then(data => {
      
      console.log(data);
      const table = document.querySelector('.table');

      table.innerHTML = data;
    })
    


});
  
