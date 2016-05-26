# Outco Assessment

Hello class, this is the repository for the Outco Assessment. 
Have this repo forked, and cloned down to your own machine. 
We will release the rest of the repo at the designated start 
time. Please follow the instructions below:

### Setup

Go the the [Outco_Assessment](https://github.com/OutcoSF/outco_assessment)
repo. Fork it over, then clone it down to your machine with
the following command: 

```
git clone https://github.com/YOUR_USERNAME/outco_assessment.git
```

From here, create the upstream remote to the Outco repo: 

```
git remote add upstream https://github.com/OutcoSF/outco_assessment.git
```

That is it for the setup

### Assessment day

When we have notified you that we have uploaded the 
assessment, run the following command to merge it over: 

```
git pull --rebase upstream master
```

Please flag one of us down if you have any issues with the 
process up to here. 

We recommend that you regularly add and commit your work. 
Upon completion of your exam, have your commits pushed up to
your own private repo

```
git push origin master
```

Then, make a pull request from your private repository to
the Outco organization repository. Make only one pull 
request. If you have any questions during this period, 
please reach out to one of us. 