package com.samsul.finalproject3_kelompok3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.samsul.finalproject3_kelompok3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel viewModel;
    String count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        setButton();
        displayResult();

    }

    @SuppressLint("SetTextI18n")
    private void setButton() {
        binding.btnOne.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "1");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "1");
            }

        });

        binding.btnTwo.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "2");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "2");
            }
        });

        binding.btnThree.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "3");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "3");
            }
        });

        binding.btnFour.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "4");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "4");
            }
        });

        binding.btnFive.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "5");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "5");
            }
        });

        binding.btnSix.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "6");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "6");
            }
        });

        binding.btnSeven.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "7");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "7");
            }
        });

        binding.btnEight.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "8");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "8");
            }
        });

        binding.btnNine.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "9");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "9");
            }
        });

        binding.btnZero.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                count = binding.tvCount.getText().toString();
                binding.tvCount.setText(count + "0");
            } else {
                count = binding.tvCount2.getText().toString();
                binding.tvCount2.setText(count + "0");
            }
        });

        binding.btnDelete.setOnClickListener(v -> {
            if(binding.tvOperator.getText().toString().isEmpty()) {
                String s = binding.tvCount.getText().toString();
                s = s.substring(0, s.length() - 1);
                binding.tvCount.setText(s);
            } else {
                String s = binding.tvCount2.getText().toString();
                s = s.substring(0, s.length() - 1);
                binding.tvCount2.setText(s);
                if(binding.tvCount2.length() == 0) {
                    binding.tvOperator.setText("");
                }
            }


        });

        binding.btnPlus.setOnClickListener(v -> {
            binding.tvOperator.setText("+");
        });

        binding.btnMinus.setOnClickListener(v -> {
            binding.tvOperator.setText("-");
        });

        binding.btnDistribution.setOnClickListener(v -> {
            binding.tvOperator.setText("/");
        });

        binding.btnMultiplication.setOnClickListener(v -> {
            binding.tvOperator.setText("x");
        });

        binding.btnModulo.setOnClickListener(v -> {
            binding.tvOperator.setText("%");
        });

        binding.btnDeleteAll.setOnClickListener(v -> {
            binding.tvResult.setText("");
            binding.tvCount.setText("");
            binding.tvCount2.setText("");
            binding.tvOperator.setText("");
        });
        binding.btnEqual.setOnClickListener(v -> {
            calculate();
        });

    }

    private void calculate() {
        String operator = binding.tvOperator.getText().toString();
        String number1 = binding.tvCount.getText().toString();
        String number2 = binding.tvCount2.getText().toString();

        switch (operator) {
            case "+" :
                viewModel.resultSummation(number1, number2);
                break;
            case "-" :
                viewModel.resultSubtraction(number1, number2);
                break;
            case "x" :
                viewModel.resultMultiplication(number1, number2);
                break;
            case "/" :
                viewModel.resultDistribution(number1, number2);
                break;
            case "%" :
                viewModel.resultModulo(number1, number2);
                break;
            default:
                binding.tvResult.setText("0");
                break;
        }
        displayResult();
    }

    private void displayResult() {
        binding.tvResult.setText("="+viewModel.result);
    }


}