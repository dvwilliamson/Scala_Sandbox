#!/usr/bin/env bash

sbt clean coverage compile test coverageReport
sbt coverageAggregate
open ./target/scala*/scoverage-report/index.html