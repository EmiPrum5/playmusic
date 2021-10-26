/*
create table artist
(
	id bigint not null,
	dateofcreation timestamp not null,
	name varchar(255) not null,
	primary key (id)
);

create table album
(
	id bigint not null,
	dateofcreation timestamp not null,
	duration bigint not null,	
	name varchar(255) not null,
	qs bigint not null,
	id_artist bigint not null,
	primary key (id, id_artist),
	constraint fk_album_artist foreign key (id_artist) references artist(id)
);



create table song
(
	id bigint not null,	
	dateofcreation timestamp not null,
	duration bigint not null,
	name varchar(255) not null,
	id_album bigint not null,
	primary key(id, id_album),	
	constraint fk_song_album foreign key (id_album) references album(id)
);
*/