# Little App

Projet de test : **Spring Boot + PostgreSQL + Vue.js + Docker**

---

## 📦 Structure du projet

- `back/` → code Spring Boot (Java, Maven)
- `front/` → code Vue.js
- `docker-compose.yml` → conteneurs Docker pour PostgreSQL et Adminer
- `.env` → variables d'environnement pour la DB (non inclus dans le repo pour la sécurité)

---

## 🚀 Lancer le projet

### 1️⃣ Docker

1. Assure-toi que **Docker Desktop** est lancé
2. Dans le dossier racine du projet :

```bash
docker compose up -d
```

### 2️⃣ Spring Boot (back)

1. Ouvre le dossier back/ dans IntelliJ
2. Lance la classe LittleAppApplication
3. API disponible sur :
➜ http://localhost:8081 (ou le port configuré)

4. Si Spring Security est actif :
   - Username : user
   - Password : trouvé dans les logs IntelliJ

### 3️⃣ Adminer (interface DB)

| Champ     | Valeur        |
|-----------|---------------|
| System    | PostgreSQL    |
| Server    | database      |
| Username  | défini dans `.env`    |
| Password  | défini dans `.env`    |
| Database  | défini dans `.env`     |
| Port      | 5433          |

### #️⃣ Front Vue.js

Dans le dossier front/ :

Installer :
```bash
npm install
```

Lancer
```bash
npm run serve
```

Front accessible sur :
➡️ http://localhost:8082

## ⚡ Notes
.env ne doit jamais être commité
target/, node_modules/, dist/ sont ignorés via .gitignore
Adminer facilite le test de la DB

## 📝 Commandes utiles

Lister les conteneurs :
```bash
docker ps
```
Stopper :
```bash
docker compose down
```
Trouver un process : 
```bash
lsof -i :8081
```
Tuer un provess : 
```bash 
kill -9 <PID>
```

