// Make

function alertBurguerTime(){
alert("ITS BURGERTIME")
}

function printMessage(){
    console.log("Someone click on BURGER TOWN!")
}

function ChangeH1(){
    const header =  document.getElementById('red');
    if (header.style.color != "red") {
        header.style.color = "red"
    }else{
        header.style.color = "black"
    }
}