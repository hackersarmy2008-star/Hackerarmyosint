#!/usr/bin/env bash
set -euo pipefail
GRADLE_VERSION=8.4.1
CACHE_DIR="$HOME/.gradle_custom"
GRADLE_HOME="$CACHE_DIR/gradle-$GRADLE_VERSION"
DIST_URL="https://services.gradle.org/distributions/gradle-$GRADLE_VERSION-bin.zip"
if [ ! -x "$GRADLE_HOME/bin/gradle" ]; then
  echo "Downloading Gradle $GRADLE_VERSION..."
  mkdir -p "$CACHE_DIR"
  ZIP="$CACHE_DIR/gradle-$GRADLE_VERSION-bin.zip"
  if [ ! -f "$ZIP" ]; then
    curl -L -o "$ZIP" "$DIST_URL"
  fi
  unzip -qo "$ZIP" -d "$CACHE_DIR"
fi
exec "$GRADLE_HOME/bin/gradle" "$@"
