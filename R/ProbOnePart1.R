raw.data <- read.table("input", sep = "")

output <- vector()

for (i in 1:length(as.vector(raw.data))) {
 output <- sum(floor(raw.data / 3) - 2)
}

# while(output>=0, ) repeat the for loop

