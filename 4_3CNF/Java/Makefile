INPUT=test.txt
GRAMMAR=CNF3.g4
ANTLR4=java -jar /usr/local/lib/antlr-4.8-complete.jar

all:
	$(ANTLR4) $(GRAMMAR)
	javac *.java

run:
	java Main $(INPUT)

clean:
	rm *.class CNF3L*.java CNF3P*.java CNF3B*.java *.interp *.tokens