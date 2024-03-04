let canvas = document.getElementById("canvas");

canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

canvas.style.background = "#ff8";

let context = canvas.getContext("2d");
context.fillStyle = "red";
context.fillRect(10, 20, 100, 100);

context.beginPath();
context.strokeStyle = "blue";
context.lineWidth = 5;
context.arc(100, 100, 50, 0, Math.PI * 2, false);
context.stroke();
context.closePath();
