function alertText(){
    alert("Hello")
}

function alertButton(){
    alert("You win an iPone 17 pro max")
}

function SentencesRed(){
    if (document.getElementById('red').style.color != "red") {
        document.getElementById('red').style.color = "red"
    }else{
        document.getElementById('red').style.color = "black"
    }
     
}
function Red(element, id){

    const object = document.getElementById(id);
    
    if (object.style.color != "red") {
        object.style.color = "red"
        object.style.fontWeight = 900
    }else{
        object.style.color = "black"
        object.style.fontWeight = 500
        
    }
     
}