const quotes = [

    "The only way to do great work is to love what you do. – Steve Jobs",

    "Innovation distinguishes between a leader and a follower. – Steve Jobs",


    "Don’t be afraid to give up the good to go for the great. – John D. Rockefeller",


    "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",

    "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt"

];
const generateButton = document.getElementById("generateButton");

const quoteElement = document.getElementById("quote");

generateButton.addEventListener("click", generateRandomQuote);

function generateRandomQuote() {

    const randomIndex = Math.floor(Math.random() * quotes.length);

    quoteElement.textContent = quotes[randomIndex];

}