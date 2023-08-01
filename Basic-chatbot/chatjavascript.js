
function sendMessage() {
  const userInput = document.getElementById('user-input').value;

  if (userInput.trim() === '') {
    return;
  }
  appendMessage(userInput, 'user');
  respondToUser(userInput);
}

function appendMessage(message, sender) {
  const chatDisplay = document.getElementById('chat-display');
  const messageDiv = document.createElement('div');
  const messageContent = document.createElement('div'); 
  const fun = document.createElement('div');// Renamed this to 'messageContent' to avoid conflicts with the 'message' variable
  if(sender==='bot'){
    fun.textContent = '🤖 '+message;
    messageDiv.classList.add('chat-message', sender);
    chatDisplay.appendChild(messageDiv);
    messageContent.classList.add('message', sender);
    messageDiv.appendChild(messageContent);
    fun.classList.add('fun',sender);
    messageContent.appendChild(fun);
  }
  else{
    fun.textContent = message+' 👤';
    messageDiv.classList.add('chat-message', sender);
    chatDisplay.appendChild(messageDiv);
    messageContent.classList.add('message', sender);
    messageDiv.appendChild(messageContent);
    fun.classList.add('fun',sender);
    fun.style.display='flex';
    fun.style.justifyContent='flex-end';
    messageContent.appendChild(fun);
  }
  
}

function respondToUser(userInput) {
  // This is a simple example; the bot's response can be more sophisticated in a real implementation.
  var botResponse = "I'm just a basic chatbot. I don't have any advanced responses yet.";
  userInput=userInput.toLowerCase();
  if (userInput === "hello") {
    botResponse = "hi";
  } else if (userInput === "how r u?") {
    botResponse = "finee";
  }
  else if (userInput==='where am i?'){
    botResponse="In hostel";
  }
  else if(userInput==='how was the day?'){
    botResponse="Its great!!!";
  }

  setTimeout(() => {
    appendMessage(botResponse, 'bot');
  }, 500);
}
