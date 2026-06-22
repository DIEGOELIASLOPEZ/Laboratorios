// Type your code below this line!

function Mail(subj, msg) {
    this.subject = subj
    this.message = msg

    this.printMail = function(){
      console.log(this.subject + ": " + this.message)
    }
  }
  
  const newMail = new Mail("pizza", "pineapple")

  
  newMail.printMail()