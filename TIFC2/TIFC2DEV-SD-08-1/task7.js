
class Player {
  constructor(name, level, exp) {
    this.name = name;
    this.level = level;
    this.exp = exp;
    this.partyMembers = [];
    this.inventory = [];
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

  // Amigos

  viewParty() {
    this.partyMembers.length == 0 ? console.log("You don't have friends") :
      this.partyMembers.forEach(element =>
        console.log(`- ${element}`));
  }


  addFriend(friend) {
    this.partyMembers.push(friend)
  }
  deleteFriend(friend) {
    const positionFriend = this.partyMembers.indexOf(friend)
    this.partyMembers.splice(positionFriend, 1)
  }

  // Inventario
  viewInventory() {
    console.log(this.inventory)
  }

  addElementInventory(objet) {
    this.inventory.push(objet)
  }
  removeElementInventory(objet) {
    const positionElement = this.inventory.indexOf(objet)
    this.inventory.splice(positionElement, 1)
  }
}


class item {
  constructor(name) {
    this.name = name;
  }

}

class Wepon extends item{
  constructor(name, damage){
    super(name)
    this.damage = damage
  }
}

const player = new Player("p1", 4, 99)
const sword = new Wepon("Sword", 10); 
const axe  = new Wepon("axe ", 12); 
const gun  = new Wepon("gun", 20); 

player.addElementInventory(sword)
player.addElementInventory(axe)
player.viewInventory();

console.log("---------------------------")

player.removeElementInventory(sword)
player.viewInventory();
