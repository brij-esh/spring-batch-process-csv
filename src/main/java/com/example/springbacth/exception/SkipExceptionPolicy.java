package com.example.springbacth.exception;import org.springframework.batch.core.step.skip.SkipLimitExceededException;import org.springframework.batch.core.step.skip.SkipPolicy;import org.springframework.batch.item.file.FlatFileParseException;public class SkipExceptionPolicy implements SkipPolicy {    @Override    public boolean shouldSkip(Throwable t, long skipCount) throws SkipLimitExceededException {        return t instanceof FlatFileParseException;    }}