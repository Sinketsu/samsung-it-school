TreeMap <String, String> mondayPets = new TreeMap<>();
for (Map.Entry<String, String> item : pets.entrySet())
{
	if (item.getKey().charAt(0) >= 'A' && item.getKey().charAt(0) <= 'H')
		mondayPets.put(item.getKey(), item.getValue());
}