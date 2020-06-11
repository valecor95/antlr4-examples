JAVA=/usr/bin/java
OUTPUT=output
GENERATED=generated
GRAMMAR=Btree.g4
ANTLR4=../../antlr-4.8-complete.jar

# here is where you plug in the runtime for your OS
RUNTIME=runtime-linux
CC=g++
CCARGS=-c -I $(RUNTIME)/antlr4-runtime/ -I $(GENERATED) -std=c++11	
LDARGS=-g
LIBS=$(RUNTIME)/lib/libantlr4-runtime.a

all: main

main: dirs antlr4 main.cpp
	$(CC) $(CCARGS) main.cpp  -o $(OUTPUT)/main.o 
	$(CC) $(CCARGS) $(GENERATED)/BtreeBaseListener.cpp -o $(OUTPUT)/BtreeBaseListener.o 
	$(CC) $(CCARGS) $(GENERATED)/BtreeLexer.cpp -o $(OUTPUT)/BtreeLexer.o 
	$(CC) $(CCARGS) $(GENERATED)/BtreeListener.cpp -o $(OUTPUT)/BtreeListener.o 
	$(CC) $(CCARGS) $(GENERATED)/BtreeParser.cpp -o $(OUTPUT)/BtreeParser.o 
	$(CC) $(LDARGS) $(OUTPUT)/main.o $(OUTPUT)/BtreeBaseListener.o $(OUTPUT)/BtreeLexer.o $(OUTPUT)/BtreeListener.o $(OUTPUT)/BtreeParser.o $(LIBS) -o main

antlr4: $(GRAMMAR)
	$(JAVA) -jar $(ANTLR4) -Dlanguage=Cpp -o $(GENERATED) $(GRAMMAR)

dirs:
	mkdir -p $(OUTPUT) 
	mkdir -p $(GENERATED) 

clean:
	rm main
	rm -rf $(OUTPUT)
	rm -rf $(GENERATED)
