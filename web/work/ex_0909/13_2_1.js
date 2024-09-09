document.addEventListener("DOMContentLoaded",function(e){
    let btn = document.querySelector("input");
    let p = document.querySelector("p");
    btn.addEventListener("click", function(e){
        //textContent : 태그에 들어있는 content의 내용을 반환
        p.textContent="JS로 입력함";
    })
})