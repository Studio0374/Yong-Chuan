.PHONY: install analysis test docs

install:
	@java -version || (echo "Java is not installed, please install Java >= 7"; exit 1);
	mvn clean install
	mvn dependency:resolve-plugins

analysis:
	mvn checkstyle:check

test:
	mvn test

docs:
	rm -rf docs
	mvn javadoc:javadoc

API_DEFINITIONS_SHA=$(shell git log --oneline | grep Regenerated | head -n1 | cut -d ' ' -f 5)
CURRENT_TAG=$(shell [[ "${GITHUB_TAG}" == *"-rc"* ]] && echo "rc" || echo "latest")
docker-build:
	docker build -t twilio/twilio-java .
	docker tag twilio/twilio-java twilio/twilio-java:${GITHUB_TAG}
	docker tag twilio/twilio-java twilio/twilio-java:apidefs-${API_DEFINITIONS_SHA}
	docker tag twilio/twilio-java twilio/twilio-java:${CURRENT_TAG}

docker-push:
	docker push twilio/twilio-java:${GITHUB_TAG}
	docker push twilio/twilio-java:apidefs-${API_DEFINITIONS_SHA}
	docker push twilio/twilio-java:${CURRENT_TAG}
