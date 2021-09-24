
import pandas


datadictionary = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a DataFrame using that data
dataframe = pandas.DataFrame(datadictionary)


print(dataframe)

dataframe.to_csv("user.csv", index=False)