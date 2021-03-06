# Hello World! :v:

<p align="center">
  <img alt="logo shopee" width="150" height="auto" src="https://github.com/ldsleticia/Shopee-Case/blob/main/git-repo-assets/Shopee-Logo.png" />
</p>

<p align="center">
	<img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/ldsleticia/Shopee-Case?color=" />
	<img alt="Number of lines of code" src="https://img.shields.io/tokei/lines/github/ldsleticia/Shopee-Case?color=blue" />
	<img alt="Code language count" src="https://img.shields.io/github/languages/count/ldsleticia/Shopee-Case?color=" />
	<img alt="GitHub top language" src="https://img.shields.io/github/languages/top/ldsleticia/Shopee-Case?color=blue" />
	<img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/ldsleticia/Shopee-Case?color=" />
</p>

<p align="justify">
This repository consists in a project of console application developed in Java for the challenge: Shopee Case as part of the admission process for a junior developer at Shopee Developer Team Product BR.
</p>

# Shopee-Case

<p align="justify">
Build a script, implementing the seller's ranking logic, where the user,
from the terminal, inputs a Sale item and the output is printed as an updated list of all sales
registered, sorted by sellers with the highest to lowest amount sold.
	
- A Sale item must have at least the following attributes: (Seller Name, Customer Name,
Date of Sale, Sale Item Name, Sale Value)
- Five Sellers should be registered and no Sale Item can be registered with a different
seller name other than the five available.
- Script must run in the terminal only
</p>

## How this project was developed

Following the case specifications, the project consists of a console application with data input from Stdin and output to Stdout. Developed using the Java language with OpenJdk 11 and Intellij Idea IDE, and also Maven as a dependency and build management tool.

## How I Run This Project

See instructions to run this project in Local Execution via source code and Ide, Local Execution via source code and jar file and also the dockerized way.

### Local Execution

First, you must have the following tools on your local machine:

- Jdk 11: I recommend use AdoptOpenJdk. [See here to install](https://adoptopenjdk.net/)
- Maven: I reccomend use the latest version. [See here to install](https://maven.apache.org/install.html)
- Java IDE: I recommend use the Intellij Idea. [See here to install](https://www.jetbrains.com/pt-br/idea/download/)

:arrow_right: First, download the project using the command:
```shell
git clone git@github.com:ldsleticia/Shopee-Case.git
```

:arrow_right: And now, import the project in your java IDE, and run the Main.java file, like this:

<p align="left">
  <img alt="main execution" width="auto" height="auto" src="https://github.com/ldsleticia/Shopee-Case/blob/main/git-repo-assets/run-Main-by-Ide.png" />
</p>


If you prefer execute this project via command line, after download and inside the project directory, run the following commands to build by Maven and execute the jar file:
```shell
maven clean install
cd target
java -jar shopee-case-1.0-SNAPSHOT.jar
```

### Dockerized Execution

You can get the project image and see the execution instructions at: [https://hub.docker.com/repository/docker/ldsleticia/shopee-case](https://hub.docker.com/repository/docker/ldsleticia/shopee-case)

Or execute the following command in your terminal, to get the image and run in the interactive terminal (:heavy_exclamation_mark: the docker needs to run interactively):
```shell
docker run -it ldsleticia/shopee-case:latest
```

