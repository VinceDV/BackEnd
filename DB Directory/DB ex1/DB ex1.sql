CREATE TABLE clienti(
    NumeroCliente SERIAL NOT NULL PRIMARY KEY,
    nome VARCHAR NOT NULL,
    cognome VARCHAR NOT NULL,
    dataNascita INTEGER NOT NULL,
    regioneResidenza VARCHAR NOT NULL
);
CREATE TABLE fatture(
    numeroFattura SERIAL NOT NULL PRIMARY KEY,
    tipologia VARCHAR NOT NULL,
    importo INTEGER NOT NULL,
    iva INTEGER NOT NULL,
    idCliente INTEGER NOT NULL,
    dataFattura INTEGER NOT NULL,
    numeroFornitore INTEGER NOT NULL
);
CREATE TABLE prodotti(
    idProdotto SERIAL NOT NULL PRIMARY KEY,
    descrizione VARCHAR NOT NULL,
    inProduzione VARCHAR NOT NULL,
    inCommergio VARCHAR NOT NULL,
    dataAttivazione INTEGER NOT NULL,
    dataDisattivazione INTEGER NULL
);
CREATE TABLE fornitori(
    numeroFornitore SERIAL NOT NULL PRIMARY KEY,
    denominazione VARCHAR NOT NULL,
    regioneResidenza VARCHAR NOT NULL
);
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Giorgio', 'Vanni', 1968, 'Lazio');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Manuele', 'Picchio', 1973, 'Veneto');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Carla', 'Fracci', 1938, 'Sicilia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Massimo', 'Decimo', 1998, 'Umbria');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Manuela', 'Vanni', 1968, 'Lombardia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Carlo', 'Mollica', 1982, 'Sicilia');
INSERT INTO clienti (nome, cognome, dataNascita, regioneResidenza) VALUES ('Carlotta', 'Burro', 1982, 'Sicilia');

INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('A', 200, 20, 3, 2009, 2);
INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('A', 400, 20, 1, 2012, 5);
INSERT INTO fatture (tipologia, importo, iva, idCliente, dataFattura, numeroFornitore) VALUES ('B', 100, 50, 2, 2023, 1);

INSERT INTO prodotti (descrizione, inProduzione, inCommergio, dataAttivazione) VALUES ('tavolo', 'si', 'si', 2002);
INSERT INTO prodotti (descrizione, inProduzione, inCommergio, dataAttivazione) VALUES ('sedia', 'si', 'si', 2001);
INSERT INTO prodotti (descrizione, inProduzione, inCommergio, dataAttivazione, dataDisattivazione) VALUES ('scrivania', 'no', 'no', 2002, 2003);
INSERT INTO prodotti (descrizione, inProduzione, inCommergio, dataAttivazione) VALUES ('microfono', 'no', 'no', 2017);
INSERT INTO prodotti (descrizione, inProduzione, inCommergio, dataAttivazione) VALUES ('webcam', 'no', 'si', 2017);

INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('rpg', 'Lombardia');
INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('rh2', 'Sicilia');
INSERT INTO fornitori (denominazione, regioneResidenza) VALUES ('rgv', 'Lazio');


SELECT * FROM clienti WHERE dataNascita = 1982;
SELECT * FROM fatture WHERE iva = 20;
SELECT * FROM fatture WHERE tipologia = 'A';
SELECT * FROM prodotti WHERE dataAttivazione = 2017 AND inProduzione = 'si' OR inCommergio = 'si';
SELECT * FROM fatture WHERE tipologia = 'A';

CREATE TABLE school_students(
    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR NOT NULL,
	lastName VARCHAR NOT NULL,
    gender VARCHAR NOT NULL,
    dataNascita INTEGER NOT NULL,
	avg INTEGER NOT NULL,
    minVote INTEGER NOT NULL,
	maxVote INTEGER NOT NULL,
);
