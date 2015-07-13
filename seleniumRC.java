
selenium.start();
selenium.open("/");

selenium.windowMaximize();
selenium.windowFocus();
selenium.getTitle();
selenium.type(xpath, text)
selenium.click(xpath);
selenium.waitForPageToLoad("3000");
selenium.getText(id path);

Assert.assertEuals(actual, expected);

selenium.close();