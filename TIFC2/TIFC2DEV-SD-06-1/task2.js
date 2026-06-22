const process = require('process');
const args = process.argv;

function Mail(subj, msg) {
    this.subject = subj
    this.message = msg
  }
  
  // Type your code below this line!
  
  // const newMail = new Mail(args[2], args[3]  )
  const newMail = new Mail('tomato', 'sauce' )
  
  // Type your code above this line!
  
  console.log(newMail.subject + ": " + newMail.message)