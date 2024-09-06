//document 객체를 대상으로 하는 이벤트리스너를 추가한다.
//이벤트의 종류는 DOMContentLoaded이다.
//DOMContentLoaded : 문서의 콘텐츠 로딩이 완료되었음을 의미하는 이벤트 
document.addEventListener("DOMContentLoaded",
//html 돔이 로딩이 될때 실행 
    function(e){
        //input 태그를 찾아 button 변수에 저장
        let button = document.querySelector("input");
        //button 변수에 이벤트리스너 추가
        //이벤트 종류는 input
        button.addEventListener("input",function(e){
        //e : event에 대한 정보, 이벤트가 발생한 태그에 콘솔값을 보여줌
        console.log(e.target.value);
        });
    }
)

function hi(){
    alert("hi");
}


function Test(name,age){
    this.name = name;
    this.age = age;
    this.testFunc = function (){
        console.log('test Function');
    }
}
let test = new Test('Hwan',30,'<br>');
document.write(test.name);
document.write(test.age);
test.testFunc();

