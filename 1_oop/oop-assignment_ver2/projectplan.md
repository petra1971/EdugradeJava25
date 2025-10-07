#Planering av projektet

Character (abstract)
 | Hero
 | Enemy (abstract)
   | Dog
   | FarmerBoss

# Main
- [x] test weapon
- [ ] Starta spelet och kör tills hjälten dör eller alt 3 väljs

# Abstrakta klasser
Konstanter är i UPPER_CASE
- [ ] Character
  - String name
  - int hp
  - int MAXHP
  - int damage?
  - isALive
  - abstract attack()
  - abstract takeDamage()
- [ ] Enemy extends Character
  - int xpReward
  - int carrotReward

Protected används för egenskaper som ska ärvas
Innehåller minst en abstrakt metod vardera
Konkreta klasser implementerar alla abstrakta metoder

# Konkreta klasser
Konstanter är i UPPER_CASE
- [x] Weapon
  - String name
  - int damage

- [ ] Hero extends Character
  - int xp
  - int MAX_XP
  - int level
  - int MAX_LEVEL
  - int weapon
    - Konkreta
      - implementera attack() -> damage, alltid samma?
      - gainXP (vid 100 -> levelUp, xp = xp-100)
      - implementera takeDamage() -> HP minskar, min = 0
      - levelUp()
      - status()
- [ ] FuriousDog extends Enemy
    - implementera attack() -> random damage
    - implementera takeDamage() -> HP minskar, min = 0
- [ ] InsaneFarmer(Boss)
  - implementera attack() -> random damage. Börja med enkla värden
  - implementera takeDamage() -> HP minskar, min = 0
  - specialAttack -> random doubleDamage 30% chans
  - tydlig info om dubbelDamage aktiveras
- [ ] Secure place?
  - får xp och morötter
-----------------------
- [ ] Meny
 - [ ] Först enkel meny
  - 1. Testa strid
  - 2. Avsluta

- [ ] Enkel Fight
- Skapa Hero
- Skapa Enemy
- Hero attackerar Enemy
- Enemy attackerar Hero
- Repetera till någon dör
- [ ] Lägg till slump (70% vanligt monster, 10% boss, 20% inget)
    - Fight med Dog 70%
    - Fight med Farmer 10%
    - Fight pågår tills någon når HP 0
    - Safe place 20%, får morötter, ökar xp
  - Testa att köra 10 rundor
  
- [ ] Visa spelarinfo
- [ ] Fullständig meny
  - 1. Adventure
  - 2. Player Info
  - 3. End game

  X. Shop

# Hantering av alternativen i menyn 
# Hjälpmetoder
  ## Inläsning
- [ ] Inlösning av text med felhantering
- [ ] Inläsning av integer med felhantering (kan bara välja alterntiven i menyn)
- [ ] Inlösning av specifika tecken, t ex Y, N
  ## Annat
- [ ]  randomInt()
- [ ]  sleepForMilliSeconds()

# MD-STRUKTUR
### Titel 3

Brödtext: Kod från letionerna

_Kursiv text med tailing whitespace_  
*Kursiv text*

__Fet text med tailing dvs 2 whilespace__  
**Fet text**

- lista
- lista
- lista

---

* lista
* lista
* lista

---

1. list
    * lista
    * lista
2. list
3. list

Shift+tab för att ångra tab

Checklista
- [ ] lista
- [ ] lista
- [ ] lista
