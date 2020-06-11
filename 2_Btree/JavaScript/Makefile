GRAMMAR=Btree.g4
ANTLR4=java -jar /usr/local/lib/antlr-4.8-complete.jar
LANGUAGE=-Dlanguage=JavaScript

all:
	$(ANTLR4) $(LANGUAGE) $(GRAMMAR) 

run:
	node main.js

clean:
	rm BtreeL*.js BtreeP*.js *.interp *.tokens