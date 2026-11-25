CREATE TABLE Utilisateur(
   id_utilisateur INT AUTO_INCREMENT,
   prenom VARCHAR(50),
   nom VARCHAR(50),
   PRIMARY KEY(id_utilisateur)
);

CREATE TABLE Compte(
   id_compte INT AUTO_INCREMENT,
   somme DECIMAL(15,2),
   taux_interet DECIMAL(12,2),
   type VARCHAR(50),
   id_utilisateur INT NOT NULL,
   PRIMARY KEY(id_compte),
   FOREIGN KEY(id_utilisateur) REFERENCES Utilisateur(id_utilisateur)
);

CREATE TABLE Retrait(
   id_retrait INT AUTO_INCREMENT,
   date_retrait DATE,
   somme DECIMAL(15,2),
   id_compte INT NOT NULL,
   PRIMARY KEY(id_retrait),
   FOREIGN KEY(id_compte) REFERENCES Compte(id_compte)
);

CREATE TABLE Depot(
   id_depot INT AUTO_INCREMENT,
   date_depot DATE,
   somme DECIMAL(15,2),
   id_compte INT NOT NULL,
   PRIMARY KEY(id_depot),
   FOREIGN KEY(id_compte) REFERENCES Compte(id_compte)
);
