CREATE TABLE pets (
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      kind VARCHAR(255) NOT NULL,
                      sex VARCHAR(10) NOT NULL,
                      vaccinated BOOLEAN NOT NULL
);
