In clasa Produs, avem proprietatile date in cerinta si clasele Tablou, Mobila si Bijuterie care o extind clasa Produs, fiecare avand proprietatile sale definite in cerinta.
clasa Angajat are clasele Broker si Administrator care o extind.
Clientul poate fi ori Persoana Juridica ori persoana fizica cu proprietatile sale specifice.
Am folosit arraylist uri generice pentru clienti si produse.

Design patterns:
Am implementat un pattern de tip build pentru clasa Licitatie, 2 de tip factory pentru Client si Produs.

In Administrator am implementat metoda de adaugare a unui produs, stiind ca doar acesta are voie sa adauge un produs in lista de produse.
Brokerul, pe langa metoda de stergere a unui produs
Produs, Tablou, Mobila, Bijuterie:
Am ales implementarea clasei Produs ca fiind clasa parinte, iar celelalte 3 sa fie clase copil.

In clasa Produs am implementat metodele get si set pentru campurile clasei
In clasele copil am implementat metodele get, set
Pentru creearea de produse am folosit un design pattern de tip factory, pe care am implementat-o in clasa ProdusFactory

Client, PersoanaFizica, PersoanaJuridica:
Am ales sa implementez clasa Client ca si clasa parinte si celelalte doua ca si clase copil.

In clasa Client, pe langa campurile din enunt am adaugat eu campul sLicitata, in care salvez suma pe care a licitat-o clientul respectiv. Am implementat metodele get, set, o metoda liciteaza,
in care folosesc Math.random() pentru a licita o suma.
Clasele copil au implementate metodele get si set, cat si toString.
Am folosit un design pattern de tip factory pentru a crea obiecte de tip clienti, design 
implementat intr-o clasa separata.

Licitatie:
Toti clientii liciteaza iar cel cu cel mai mare pret castiga, licitatia avand doar un pas. (metoda start)

In clasa CasaLicitatii am implementat metodele corespunzatoare comunicarii clientului direct cu casa; adaugarea clientului la inceput.

In main, am citit produsele si clientii, am iterat prin produse sa vad care este cel mai dorit 
dintre ele si am pornit licitatia. Dupa licitatie, am sters obiectul.

Testare: 

1)
lala
0 abcd 2000 1837 Tablou daVinci ulei
lala
1 MonaLisa 20000 1837 Tablou DaVinci ulei
lala
2 Inel 1000 2020 Bijuterie aur true
lala
3 masaArtizanala 2000 2018 Mobila scaun piatra
lala
4 portret 2000 1880 Tablou DaVinci ulei
stop

lala
0 Adi Bucuresti Fizica 3 04-10-1990
lala
1 Alex Pitesti Fizica 1 18-04-2000
lala
3 Andi Buzau Fizica 2 04-10-2000
lala
4 Silvia Bucuresti Juridica  1 2000 SRL
lala
5 Vlad Bucuresti Fizica 2  04-12-1998
stop

2)
lala
0 portret 2500 1850 Tablou DaVinci ulei
lala
1 Inel 1500 2020 Bijuterie aur true
lala
2 lustra 1600 2020 Mobila lampa metal
lala
3 pictura 2000 1880 Tablou DaVinci ulei
lala
4 Colier 1000 2020 Bijuterie aur true
lala
5 Pictura 2000 1890 Tablou VanGogh ulei
stop

lala
0 Rares Bucuresti Fizica 1 04-12-1990
lala
1 Bianca Ploiesti Fizica 2 18-04-2000
lala
3 Adrian Buzau Fizica 3 04-10-2000
lala
4 Mihaela Bucuresti Juridica 4 2000 SRL
lala
5 Vlad Bucuresti Fizica 2 04-12-1999
stop

3)
lala
0 MonaLisa 2000 1890 Tablou DaVinci ulei
lala
1 Inel 1000 2020 Bijuterie aur true
lala
2 GameofThronesThrone 1600 2020 Mobila scaun metal
lala
3 Statuie 2000 1880 Mobila DaVinci metal
lala
4 Cercei 1000 2020 Bijuterie aur true
lala
5 Pictura 2000 1890 Tablou VanGogh ulei
stop


lala
0 Mihai Bucuresti Fizica 1 04-10-1990
lala
1 Bianca Ploiesti Fizica 2 18-04-2000
lala
3 Adrian Buzau Fizica 3 04-10-2000
lala
4 Gabriela Bucuresti Juridica 2 2000 SRL
lala
5 Andrei Bucuresti Fizica 1 04-12-1999
stop

4)
lala
6 Scaun 1600 2020 Mobila scaun fag
lala
7 Cercei 2000 2024 Bijuterie diamant true
lala
8 Colier 1000 2020 Bijuterie aur true
lala
9 Pictura 2000 1890 Tablou VanGogh ulei
lala
10 Scaun 1600 2020 Mobila scaun fag
lala
11 Cercei 2000 2024 Bijuterie diamant true
stop

lala
1 Bianca Ploiesti Fizica 7 18-04-2000
lala
3 Adrian Buzau Fizica 8 04-10-2000
lala
4 Gabriela Bucuresti Juridica 9 2000 SRL
lala
5 Andrei Bucuresti Fizica 8 04-12-1999
lala
6 Alex Buftea Juridica 7 3000 SRL
lala
7 Cristi Bucuresti Fizica 10 18-04-1900
stop

5)
lala
8 Colier 1000 2020 Bijuterie aur true
lala
9 Pictura 2000 1890 Tablou VanGogh ulei
lala
10 Scaun 1600 2020 Mobila scaun fag
lala
11 Cercei 2000 2024 Bijuterie diamant true
lala
12 MasaArtizanala 1600 2020 Mobila masa piatra
lala
13 Bagheta 1800 2020 Mobila scaun fag
stop


lala
4 Gabriela Bucuresti Juridica 8 2000 SRL
lala
5 Andrei Bucuresti Fizica 9 04-12-1999
lala
6 Alex Buftea Juridica 10 3000 SRL
lala
7 Cristi Bucuresti Fizica 11 18-04-1900
lala
8 Mihaela Baneasa Fizica 9 10-05-2000
lala
9 Sabina Baneasa Fizica 8 28-10-2000
stop

6)
lala
8 Colier 1000 2020 Bijuterie aur true
lala
9 Pictura 2000 1890 Tablou VanGogh ulei
lala
10 Scaun 1600 2020 Mobila scaun fag
lala
11 Cercei 2000 2024 Bijuterie diamant true
lala
12 MasaArtizanala 1600 2020 Mobila masa piatra
lala
13 Bagheta 1800 2020 Mobila scaun santal
stop


lala
5 Andrei Bucuresti Fizica 8 04-12-1999
lala
6 Alex Buftea Juridica 9 3000 SRL
lala
7 Cristi Bucuresti Fizica 10 18-04-1900
lala
8 Mihaela Baneasa Fizica 11 10-05-2000
lala
9 Sabina Baneasa Fizica 9 28-10-2000
lala
10 Vlad Ploiesti Juridica 8 4000 SRL
stop

7)
lala
9 Pictura 2000 1890 Tablou VanGogh ulei
lala
10 Scaun 1600 2020 Mobila scaun fag
lala
11 Cercei 2000 2024 Bijuterie diamant true
lala
12 MasaArtizanala 1600 2020 Mobila masa piatra
lala
13 Bagheta 1800 2020 Mobila scaun santal
lala
14 PatChinezesc 4000 2020 Mobila pat santal
stop

lala
5 Andrei Bucuresti Fizica 9 04-12-1999
lala
6 Alex Buftea Juridica 10 3000 SRL
lala
7 Cristi Bucuresti Fizica 11 18-04-1900
lala
8 Mihaela Baneasa Fizica 12 10-05-2000
lala
9 Sabina Baneasa Fizica 13 28-10-2000
lala
10 Vlad Ploiesti Juridica 11 4000 SRL
stop

8)
lala
10 Scaun 1600 2020 Mobila scaun fag
lala
11 Cercei 2000 2024 Bijuterie diamant true
lala
12 MasaArtizanala 1600 2020 Mobila masa piatra
lala
13 Bagheta 1800 2020 Mobila scaun santal
lala
14 PatChinezesc 4000 2020 Mobila pat santal
lala
15 Portret 3000 1890 Tablou Dali ulei
stop


lala
6 Alex Buftea Juridica 10 3000 SRL
lala
7 Cristi Bucuresti Fizica 11 18-04-1900
lala
8 Mihaela Baneasa Fizica 12 10-05-2000
lala
9 Sabina Baneasa Fizica 10 28-10-2000
lala
10 Vlad Ploiesti Juridica 14 4000 SRL
lala
11 Cezar Madrid Fizica 11 10-10-2000
stop


9)
lala
0 MonaLisa 2000 1890 Tablou DaVinci ulei
lala
1 Inel 1000 2020 Bijuterie aur true
lala
2 GameofThronesThrone 1600 2020 Mobila scaun metal
lala
3 Strigatul 2000 1880 Tablou DaVinci ulei
lala
4 Colier 1000 2020 Bijuterie aur true
lala
5 Pictura 2000 1890 Tablou VanGogh ulei
stop

lala
0 Marius Bucuresti Fizica 1 04-10-1990
lala
1 Bianca Ploiesti Fizica 2 18-04-2000
lala
3 Adrian Buzau Fizica 3 04-10-2000
lala
4 Gabriela Bucuresti Juridica 4 2000 SRL
lala
5 Andrei Bucuresti Fizica 1 04-12-1999
stop

10)
lala
0 MonaLisa 2000 1890 Tablou DaVinci ulei
lala
1 Inel 1000 2020 Bijuterie aur true
lala
2 GameofThronesThrone 1600 2020 Mobila scaun metal
lala
3 Strigatul 2000 1880 Tablou DaVinci ulei
lala
4 Colier 1000 2020 Bijuterie aur true
lala
5 Pictura 2000 1890 Tablou VanGogh ulei
stop

lala
0 Marius Bucuresti Fizica 1 04-10-1990
lala
1 Bianca Ploiesti Fizica 2 18-04-2000
lala
2 Cezar Madrid Fizica 3 10-10-2000
lala
3 Adrian Buzau Fizica 4 04-10-2000
lala
4 Gabriela Bucuresti Juridica 5 2000 SRL
lala
5 Andrei Bucuresti Fizica 2 04-12-1999
stop
