var randomChange = document.getElementById('home'),
    images = ['/images/bg.jpg', '/images/bg1.jpg', '/images/bg2.jpg', '/images/bg3.jpg', '/images/bg4.jpg' ]

let imgCount = images.length;

let number = Math.floor(Math.random() * imgCount);
// alert(number)

window.onload = function () {
    randomChange.style.backgroundImage = 'linear-gradient(rgba(0,0,0,0.500),rgba(0,0,0,0.50)), url(' + images[number] + ')';
}

