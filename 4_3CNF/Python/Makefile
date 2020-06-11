INPUT=test.txt
GRAMMAR=CNF3.g4
ANTLR4=java -jar /usr/local/lib/antlr-4.8-complete.jar
LANGUAGE=-Dlanguage=Python3

all:
	$(ANTLR4) $(LANGUAGE) $(GRAMMAR) 

run:
	python3 main.py $(INPUT)

clean:
	rm CNF3L*.py CNF3P*.py *.interp *.tokens