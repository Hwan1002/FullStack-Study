//button을 눌렀을때 img태그의 이미지를 변경하기
//profile.jpg -> hl1.jpg -> hl2.jpg
//img src ="이미지 경로"
//버튼을 눌렀을 때 ("click")
//img 태그의 정보를 변수에 저장한한다
//변수에서 src값을 변
document.addEventListener("DOMContentLoaded",function(e){
    let btn = document.querySelector("input");
    let img = document.querySelector("img");
    let img1 = "img/profile.jpg";
    let img2 = "img/hl1.jpg";
    let img3 = "img/hl2.jpg";

    btn.addEventListener("click",function(e){
        console.log(1);
        //img태그의 src를 수정해야함
        let src = img.getAttribute("src")
        if( src === img1){
            img.setAttribute("src",img2);
        }else if(src === img2){
            img.setAttribute("src",img3);
        }else{
            img.setAttribute("src",img1);
        };  
    })

})



