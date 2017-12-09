CREATE DATABASE cardealer;
USE cardealer;
CREATE table cars(
	id INT NOT NULL AUTO_INCREMENT,
    make VARCHAR(20) NOT NULL,
    model VARCHAR(20) NOT NULL,
    year INT NOT NULL,
	PRIMARY KEY (id));

INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Ford', 'Mustang', '2017');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Toyota', 'Camry', '2016');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Honda', 'Accord', '2015');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Nissan', 'Maxima', '2016');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Dodge', 'Grand Caravan', '2015');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Chevrolet', 'Camaro', '2018');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Ford', 'Focus', '2017');
INSERT INTO `cardealer`.`cars` (`make`, `model`, `year`) VALUES ('Nissan', 'Ultima', '2016');