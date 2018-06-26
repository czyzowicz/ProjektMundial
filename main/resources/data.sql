insert into Coach (id, name ) values (1001, 'Jose Pekerman');
insert into Coach (id, name ) values (1002, 'Tite');
insert into Coach (id, name ) values (1003, 'Adam Nawalka');
insert into Coach (id, name ) values (1004, 'Jorge Sampaolini');
insert into Coach (id, name ) values (1005, 'Niko Kovac');
insert into Coach (id, name ) values (1006, 'Didier Deschamps');
insert into Coach (id, name ) values (1007, 'Michael Laudrup');
insert into Coach (id, name ) values (1008, 'Fernadno Hierro');

insert into Team (id, name, coach_id ) values (100, 'Denmark', 1007);
insert into Team (id, name, coach_id ) values (200, 'Poland', 1003);
insert into Team (id, name, coach_id ) values (300, 'Columbia', 1001);
insert into Team (id, name, coach_id ) values (400, 'Brazil', 1002);
insert into Team (id, name, coach_id ) values (500, 'France', 1006);
insert into Team (id, name, coach_id)  values (600, 'Argentina', 1004);
insert into Team (id, name, coach_id ) values (700, 'Croatia', 1005);
insert into Team (id, name, coach_id ) values (800, 'Spain',1008);

insert into Player (id, name, team_id) values (111, 'Coutinho', 400);
insert into Player (id, name, team_id) values (112, 'Paulinho', 400);
insert into Player (id, name, team_id) values (113, 'Marcelo', 400);

insert into Player (id, name, team_id) values (222, 'Radamel Falcao', 300);
insert into Player (id, name, team_id) values (223, 'James Rodriguez', 300);
insert into Player (id, name, team_id) values (224, 'Carlos Bacca', 300);

insert into Player (id, name, team_id) values (333, 'Jakub Błaszczykowski', 200);
insert into Player (id, name, team_id) values (334, 'Łukasz Piszczek', 200);
insert into Player (id, name, team_id) values (335, 'Łukasz Fabiański', 200);

insert into Player (id, name, team_id) values (444, 'Isco', 800);
insert into Player (id, name, team_id) values (445, 'David Silva', 800);
insert into Player (id, name, team_id) values (446, 'Jordi Alba', 800);

insert into Player (id, name, team_id) values (555, 'Kun Aguero', 600);
insert into Player (id, name, team_id) values (556, 'Angel DiMaria', 600);
insert into Player (id, name, team_id) values (557, 'Ever Banenga', 600);

insert into Player (id, name, team_id) values (666, 'Kasper Schmeichel', 100);
insert into Player (id, name, team_id) values (667, 'Christian Eriksen', 100);
insert into Player (id, name, team_id) values (668, 'Yousuf Poulsen', 100);

insert into Player (id, name, team_id) values (777, 'Ivan Rakitic', 700);
insert into Player (id, name, team_id) values (778, 'Luka Modric', 700);
insert into Player (id, name, team_id) values (779, 'Ante Rebic', 700);

insert into Player (id, name, team_id) values (888, 'Ousmane Dembele', 500);
insert into Player (id, name, team_id) values (889, 'Hugo Lloris', 500);
insert into Player (id, name, team_id) values (890, 'Samuel Umtiti', 500);

insert into Match (id, teamA, teamB) values (1, 300, 500);