INPUT=test
GRAMMAR=Btree.g4
ANTLR4=java -jar /usr/local/lib/antlr-4.8-complete.jar

all:
	$(ANTLR4) $(GRAMMAR)
	javac *.java

run:
	java Main $(INPUT)

clean:
	rm *.class BtreeL*.java BtreeP*.java BtreeB*.java *.interp *.tokens