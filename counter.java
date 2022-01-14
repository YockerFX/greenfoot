public void countKills()
    {
        if(foodCounter == null) 
        {
            foodCounter = new Counter("Killed: ");
            int x = getX();
            int y = getY() + getImage().getWidth()/2 + 8;

            getWorld().addObject(foodCounter, x, y);
        }        
        foodCounter.increment();
    }
