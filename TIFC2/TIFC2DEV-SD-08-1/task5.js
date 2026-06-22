export class Player {
  constructor(name, level, exp) {
    this.name = name
    this.level = level
    this.exp = exp
  }

  info() {
    return `${this.name} has reached Level ${this.level}!`
  }
  levelUp() {
    this.level++
  }


  leveExp() {
    this.exp++
    if (this.exp === 30) {
      this.levelUp();
      this.exp = 0
    }
  }
}

const player = new Player("Grog", 4, 29)


console.log(`Nivel: ${player.level}`)
console.log(`Experiencia: ${player.exp}`)
console.log("---------------------------")
console.log("Icremento de experiencia + 1")
console.log("---------------------------")
player.leveExp();

console.log(`Nivel: ${player.level}`)
console.log(`Experiencia: ${player.exp}`)

