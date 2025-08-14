# Task: Alerts & Channels Framework
## Objective
### Build a small Java library that sends alerts of different types through different delivery channels via one unified API. The design must allow adding new alert types and new channels independently.

## Functional Requirements
Public API

Single entry point to send an alert request and return a result (status, message, optional id).

Alert Types

INFO, WARNING, CRITICAL.

Each type has its own formatting rule (e.g., prefix/tag) and may influence delivery behavior.

Channels

EMAIL: requires subject + text body (HTML optional).

SMS: max 160 characters (truncate or mark as rejected).

SLACK: supports markdown; no subject.

Routing

Request can specify a primary channel.

If primary fails, attempt a secondary channel once (if provided).

For CRITICAL, send to both primary and secondary (if provided), recording both outcomes.

Configuration

Global configuration holds default channel per alert type and enabled channels.

Configuration is globally accessible at runtime and not mutable after initialization.

Result

Return a result capturing: final status (success/failure/partial for dual-send), message, and any provider ids.

## Non-Functional Requirements
Clean separation between alert type concerns and channel delivery concerns; they must vary independently.

No if/else chains scattered across the core service for every type/channel combination.

Follow SOLID; keep the core API free of channel-specific SDK details.

Simple, readable package organization (API, core, alert-types, channels, config).
