all: sources
	podman run --rm -v "${PWD}":/app -w /app eclipse-temurin:17-jdk-jammy javac @sources.txt

sources:
	find * -name "*.java" > sources.txt

run:
	java fr.ft.avaj.main.Main scenario.txt

clean:
	rm -f fr/ft/avaj/main/*.class
	rm -f fr/ft/avaj/parser/*.class
	rm -f fr/ft/avaj/simulator/*.class


.PHONY: all run clean
