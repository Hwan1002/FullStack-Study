document.addEventListener("DOMContentLoaded",function(e){
    let btn = document.querySelector("#nameEditButton");
    let edit = document.querySelector("#editNameField");
    let nameHere = document.querySelector("#nameHere");
    
    btn.addEventListener("click",function(e){
        btn.style.display="none";
        edit.style.display="block";
        

        let input = document.querySelector('#newName');
        let ok = document.querySelector("#okbutton");
        ok.addEventListener("click",function(e){
            // console.log(input.value);
            nameHere.textContent=input.value;
        })
    })
    
})

