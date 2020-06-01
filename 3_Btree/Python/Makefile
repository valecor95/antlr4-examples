INPUT=test
GRAMMAR=Btree.g4
ANTLR4=java -jar /usr/local/lib/antlr-4.8-complete.jar
LANGUAGE=-Dlanguage=Python3

all:
	$(ANTLR4) $(LANGUAGE) $(GRAMMAR) 

run:
	python3 main.py $(INPUT)

clean:
	rm BtreeL*.py BtreeP*.py *.interp *.tokens