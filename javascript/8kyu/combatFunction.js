function combat(health, damage) {
  const newHealth = health - damage;
  if (newHealth > 0) {
    return newHealth;
  }
  return 0;
}

const log = combat(50000, 1000);
console.log(log);
