import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConvertor {
    private JFrame frame;
    private JPanel panel;
    private JTextField inputField;
    private JLabel resultLabel;
    private JComboBox<String> scaleComboBox;
    private JButton convertButton;
    private JButton clearButton;

    public TemperatureConvertor() {
        frame = new JFrame("Temperature Converter");
        panel = new JPanel();
        inputField = new JTextField(10);
        resultLabel = new JLabel("Result: ");
        scaleComboBox = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"});
        convertButton = new JButton("Convert");
        clearButton = new JButton("Clear");

        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Enter Temperature: "));
        panel.add(inputField);
        panel.add(scaleComboBox);
        panel.add(convertButton);
        panel.add(clearButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                resultLabel.setText("Result: ");
            }
        });
    }

    private void convertTemperature() {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            String selectedScale = (String) scaleComboBox.getSelectedItem();
            double result = 0;

            if (selectedScale.equals("Celsius")) {
                result = celsiusToFahrenheit(inputValue);
            } else if (selectedScale.equals("Fahrenheit")) {
                result = fahrenheitToCelsius(inputValue);
            } else if (selectedScale.equals("Kelvin")) {
                result = kelvinToCelsius(inputValue);
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConvertor();
            }
        });
    }
}
