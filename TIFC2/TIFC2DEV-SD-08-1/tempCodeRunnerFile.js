  viewParty() {
    this.partyMembers.length == 0 ? console.log("You don't have friends") :
      this.partyMembers.forEach(element =>
        console.log(`- ${element}`));
  }