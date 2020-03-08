#!/usr/bin/env bash

export PROJECT=$(gcloud config --quiet get-value project)

./gradlew clean build jibDockerBuild
docker push gcr.io/$PROJECT/springboot-jib-demo:latest

# docker run --name springboot-jib-demo -d gcr.io/xylia-platform/springboot-jib-demo:latest