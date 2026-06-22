
export class Player {
  constructor(name, level, exp) {
    this.name = name;
    this.level = level;
    this.exp = exp;
    this.partyMembers = [];
  }

  info() {
    return `${this.name} has reached Level ${this.level}!`
  }
  levelUp() {
    this.level++
  }


  leveExp() {
    this.exp++
    if (this.exp === 100) {
      this.levelUp();
      this.exp = 1
    }
  }

  viewParty() {
    console.log("Friends")
    for (let i = 0; i < this.partyMembers.length; i++) {
      console.log(this.partyMembers[i].name)
    
    }
  }


  addFriend(friend) {
    this.partyMembers.push(friend)
  }
  deleteFriend(friend) {
   const positionFriend = this.partyMembers.indexOf(friend)
    this.partyMembers.splice(positionFriend,1)
  }
}



const player = new Player("p1", 4, 99)
const player2 = new Player("p2", 5, 20)
const player3 = new Player("p3", 2, 40)

player.addFriend(player2)
player.addFriend(player3)

player.viewParty()

console.log(' ----------------- ')
player.deleteFriend(player2)

player.viewParty()

