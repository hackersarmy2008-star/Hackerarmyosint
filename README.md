# Hacker Army OSINT - Ready-to-push repo (phone-friendly)

This repository contains the demo Android app source (Jetpack Compose). It's set up so you can push to GitHub and use the included GitHub Actions workflow to build an APK in the cloud.

Important:
- The project includes a simple `gradlew` script that will download a Gradle distribution on the CI runner or local machine and run gradle tasks.
- For cloud builds on GitHub, add the workflow (see .github/workflows/) and push.
