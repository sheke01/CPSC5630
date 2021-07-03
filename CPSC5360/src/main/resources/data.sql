create database cpsc5360;

use cpsc5360;

CREATE TABLE Voters (
voter_id int NOT NULL,
ssn int(9) NOT NULL UNIQUE,
first_name varchar(128) NOT NULL,
last_name varchar(45) NOT NULL,
sex varchar(10),
date_of_birth datetime,
address varchar(45) NOT NULL,

PRIMARY KEY (voter_id)
);

select * from voters;
select * from candidates;

CREATE TABLE Candidates (
candidate_id int NOT NULL AUTO_INCREMENT,
ssn int(9) NOT NULL UNIQUE,
first_name varchar(128) NOT NULL,
last_name varchar(45) NOT NULL,
sex varchar(10),
date_of_birth datetime,
address varchar(45) NOT NULL,
position varchar(20) NOT NULL,
party varchar(15) NOT NULL,

PRIMARY KEY (candidate_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

select * from President_votes;

CREATE TABLE President_votes (
id int NOT NULL AUTO_INCREMENT,
voter_id int UNIQUE NOT NULL,
candidate_name varchar(32) NOT NULL,
date_voted datetime,

PRIMARY KEY (id),
CONSTRAINT fk_pvote FOREIGN KEY (voter_id) REFERENCES voters (voter_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

CREATE TABLE first_senate_vote (
id int NOT NULL AUTO_INCREMENT,
voter_id int UNIQUE NOT NULL,
candidate_name varchar(32) NOT NULL,
date_voted datetime,

PRIMARY KEY (id),
CONSTRAINT fk_fsvote FOREIGN KEY (voter_id) REFERENCES voters (voter_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

select * from first_senate_vote;

CREATE TABLE second_senate_vote (
id int NOT NULL AUTO_INCREMENT,
voter_id int UNIQUE NOT NULL,
candidate_name varchar(32) NOT NULL,
date_voted datetime,

PRIMARY KEY (id),
CONSTRAINT fk_ssvote FOREIGN KEY (voter_id) REFERENCES voters (voter_id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

select * from second_senate_vote;