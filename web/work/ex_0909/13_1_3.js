document.addEventListener("DOMContentLoaded", function(e){
    let input = document.querySelector('#input');
    input.addEventListener("click",function(e){
        /*요소의 속성 제어하기
        속성값 변경하기
        자바스크립트는 HTML문서를 제어하기 위한 도구이므로,
        요소의 속성을 열람하는 기능 뿐만 아니라 조작하는 기능도 있다.

        요소.setAttribute("속성", "새로운 속성값");
        */

        //속성을 조회
        //console.log(e.target.getAttribute("type"));

        //속성을 변경
        //e.target.setAttribute("type", "text");

        //속성값 토글
        if(e.target.getAttribute("type") === "button"){
            e.target.setAttribute("type", "text");
        }
    })
    //keydown은 포커스가 사라지지않아서 change로 사용하는게 낫다
    //포커스가 입력창 내부에 있기 때문에 텍스트의 입력이 덜 끝났다고 생각하여
    //작업을 수행하지 않는다.
    input.addEventListener("change",function(e){
        e.target.setAttribute("type", "button");
    })
})