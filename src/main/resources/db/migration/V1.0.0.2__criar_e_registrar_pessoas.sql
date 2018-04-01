CREATE TABLE pessoa (
  codigo      BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome        VARCHAR(50) NOT NULL,
  ativo       BOOLEAN     NOT NULL,
  logradouro  VARCHAR(50),
  numero      VARCHAR(5),
  complemento VARCHAR(50),
  bairro      VARCHAR(50),
  cep         VARCHAR(9),
  cidade      VARCHAR(100),
  estado      VARCHAR(2)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES ("João Pedro da Silva",
        1, "Quadra SMPW Quadra 22 Conjunto 2",
        "12", "Setor de Mansões Park Way", "Park Way", "71745-202", "Brasília", "DF");

INSERT INTO pessoa (nome, ativo)
VALUES ("Maria Silva",
        1);

INSERT INTO pessoa (nome, ativo, logradouro, numero, bairro, cep, cidade, estado)
VALUES ("Aliny Silva",
        1, "Quadra EQS 506/507",
        "12", "Asa Sul", "70350-580", "Brasília", "DF");

INSERT INTO pessoa (nome, ativo)
VALUES ("Pedro Manoel",
        0);